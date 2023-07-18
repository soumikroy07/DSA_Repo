package com.soumik.DS.soumik.DS;

public class CN_Fish {
    public static void main(String[] args) {
        int n = 12;
        int fish[] = new int[]{30, 20, 5 ,2, 4, 12, 10, 8, 11, 3, 18, 88};
        int dir[] = new int[]{1, 1, 1, 1, -1, -1, 1, 1,1,-1,-1,-1};

        int ans = solveFish(fish, dir, n);
        System.out.println(ans);
    }

    private static int solveFish(int[] fish, int[] dir, int n) {

        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            if(dir[i] == 1){
                int newVal = fish[i], count = 0;
                for(int j = i; j<n; j++){
                    if(newVal < fish[j]){
                        count++;
                        newVal = fish[j];
                    }
                }
                ans[i] = count;
            }else{
                int newVal = fish[i], count = 0;
                for(int j = i; j>=0; j--){
                    if(newVal < fish[j]){
                        count++;
                        newVal = fish[j];
                    }
                }
                ans[i] = count;
            }
        }
        for(int i : fish){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();

        int max = 0, a = 0;
        for(int i=0; i<n; i++){
            if(ans[i] > max){
                max = ans[i];
                a = fish[i];
            }else if(max == ans[i] && a < fish[i]){
                a = fish[i];
            }
        }
        return a;
    }
}
