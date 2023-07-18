package com.soumik.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HamiltonPath {
    public static void main(String[] args) {
        int N = 4, M = 3;
        ArrayList<ArrayList<Integer>> Edges = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        Edges.add(new ArrayList<>(list1));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        Edges.add(new ArrayList<>(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4);
        Edges.add(new ArrayList<>(list3));

        boolean ans = checkHamilton(N, M, Edges);
        System.out.println(ans);
    }

    static boolean checkHamilton(int N, int M, ArrayList<ArrayList<Integer>> Edges)
    {

        ArrayList<Integer> al[]=new ArrayList[N+1];

        for(int i=0;i<N+1;i++)
            al[i]=new ArrayList<>();

        for(ArrayList<Integer> ed:Edges)
        {
            int src=ed.get(0);
            int des=ed.get(1);
            al[src].add(des);
            al[des].add(src);
        }
        Set<Integer> st=new HashSet<>();

        for(int i=1;i<=N;i++)
        {
            if(find(al,i,st))
                return true;
        }
        return false;
    }
    public static boolean find(ArrayList<Integer> al[], int src, Set<Integer> st)
    {
        st.add(src);
        if(st.size()==al.length-1)
            return true;

        for(Integer ele:al[src])
        {
            if(!st.contains(ele))
            {
                if(find(al,ele,st))
                    return true;
            }
        }
        st.remove(src);
        return false;
    }

    /*
    private static boolean checkHamilton(int N, int M, ArrayList<ArrayList<Integer>> Edges) {
        boolean visited[] = new boolean[N+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=N; i++){
            adj.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer> list : Edges){
            adj.get(list.get(0)).add(list.get(1));
            adj.get(list.get(1)).add(list.get(0));
        }

        dfs(adj, 1, visited);

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                return false;
            }
        }

        return true;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean visited[]){
        visited[node] = true;

        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(adj, neighbour, visited);
            }
            break;
        }
    }


     */
}
