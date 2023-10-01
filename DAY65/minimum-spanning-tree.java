// https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions




class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	  
	    ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<ArrayList<ArrayList<Integer>>>(V);
	    for(int i=0;i<V;i++){
	        list.add(new ArrayList<ArrayList<Integer>>());
	    }
	    for(int i=0;i<edges.length;i++){
	        int source=edges[i][0];
	        int destination=edges[i][1];
	        int weight=edges[i][2];
	        ArrayList<Integer> edge1=new ArrayList<Integer>();
	        
	        edge1.add(destination);
	        edge1.add(weight);
	        list.get(source).add(edge1);
			
			//adding source as destination from destination as source
			//because edges are undirected
			//so if source->dest
			//then dest->source as well

	        edge1=new ArrayList<Integer>();
	        edge1.add(source);
	        edge1.add(weight);
	        list.get(destination).add(edge1);
	    }
	    int ans=0;
	    int[]key=new int[list.size()];
	    boolean[]inMST=new boolean[list.size()];
	    Arrays.fill(key,Integer.MAX_VALUE);
	    key[0]=0;

//in each iteration we will select the node nearest to current source(parent) node and update the ans(by adding key[source]or dist[source)
	    for(int i=0;i<list.size();i++){
	        int source=-1;
	        for(int j=0;j<list.size();j++){
	            if(!inMST[j]&&(source==-1||key[j]<key[source])){
	                source=j;
	            }
	        }
	        inMST[source]=true;
	        ans+=key[source];
	        for(int j=0;j<list.get(source).size();j++){
	            int node=list.get(source).get(j).get(0);
	            int weight=list.get(source).get(j).get(1);
	            if(!inMST[node]){
	                key[node]=Math.min(key[node],weight);
	            }
	        }
	    }
	    return ans;
	}
}



