package com.soumik.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int adjMatrix[][] = new int [n][n];

        for(int i=0;i<e;i++){
            int v1= sc.nextInt();
            int v2= sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        // dfs traversal

        boolean track[] =new boolean[adjMatrix.length];
        dfs(adjMatrix,0,track);

//        bfs traversal

        bfs(adjMatrix);

    }
//    bfs traversal of graph

    public static void bfs(int adjMatrix[][]){
        System.out.println("bfs");
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean track[] =new boolean[adjMatrix.length];
        track[0]=true;
        while (!q.isEmpty()){
            int e= q.poll();
            System.out.print(e+" ");
            for (int i=0;i< adjMatrix.length;i++){
                if(adjMatrix[e][i]==1 && track[i]==false){
                    q.add(i);
                    track[i]=true;
                }
            }
            e++;
        }
    }

//    dfs traversal of graph


    public static void  dfs(int adjMatrix[][],int currentVertex, boolean track[]){

        System.out.print(currentVertex+ " ");
        track[currentVertex] = true;
        for (int i=0;i< adjMatrix.length;i++){
            if(adjMatrix[currentVertex][i] == 1 && track[i]==false){
                dfs(adjMatrix,i,track);
            }
        }
    }
}
