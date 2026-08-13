class Solution {
        char[] s;
    char[] treeL,treeR;
    int[] pre,suf,best,len;

    public int[] longestRepeating(String str,String queryCharacters,int[] q) {
        s=str.toCharArray();
        int n=s.length;

        treeL=new char[4*n];
        treeR=new char[4*n];
        pre=new int[4*n];
        suf=new int[4*n];
        best=new int[4*n];
        len=new int[4*n];

        build(1,0,n-1);

        int[] ans=new int[q.length];

        for(int i=0;i<q.length;i++){
            update(1,0,n-1,q[i],queryCharacters.charAt(i));
            ans[i]=best[1];
        }

        return ans;
    }

    void build(int node,int l,int r){
        if(l==r){
            treeL[node]=treeR[node]=s[l];
            pre[node]=suf[node]=best[node]=len[node]=1;
            return;
        }

        int mid=(l+r)/2;

        build(node*2,l,mid);
        build(node*2+1,mid+1,r);

        merge(node);
    }

    void update(int node,int l,int r,int idx,char c){
        if(l==r){
            s[idx]=c;
            treeL[node]=treeR[node]=c;
            return;
        }

        int mid=(l+r)/2;

        if(idx<=mid)
            update(node*2,l,mid,idx,c);
        else
            update(node*2+1,mid+1,r,idx,c);

        merge(node);
    }

    void merge(int node){
        int a=node*2;
        int b=node*2+1;

        treeL[node]=treeL[a];
        treeR[node]=treeR[b];

        len[node]=len[a]+len[b];

        pre[node]=pre[a];
        suf[node]=suf[b];

        best[node]=Math.max(best[a],best[b]);

        if(treeR[a]==treeL[b]){
            if(pre[a]==len[a])
                pre[node]=len[a]+pre[b];

            if(suf[b]==len[b])
                suf[node]=len[b]+suf[a];

            best[node]=Math.max(best[node],suf[a]+pre[b]);
        }
   }
}