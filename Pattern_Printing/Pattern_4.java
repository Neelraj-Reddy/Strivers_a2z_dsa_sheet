class Pattern_4{
    public static void main(String[] args){
        int n = 3;
        for(int i=0; i<n ; i++){
            for (int j=0 ; j<n-1; j++){
                if(n-j<n-i){
                    System.out.print(n-i);
                }
                else{
                    System.out.print(n-j);
                }
            }

            for (int j=n-1 ; j>=0; j--){
                if(n-j<n-i){
                    System.out.print(n-i);
                }
                else{
                    System.out.print(n-j);
                }
            }
            
            System.out.println();
        }

        for(int i = n-2; i >= 0;i --){

            for (int j=0 ; j<n-1; j++){
                if(n-j<n-i){
                    System.out.print(n-i);
                }
                else{
                    System.out.print(n-j);
                }
            }

            for (int j=n-1 ; j>=0; j--){
                if(n-j<n-i){
                    System.out.print(n-i);
                }
                else{
                    System.out.print(n-j);
                }
            }
            System.out.println();
        }
    }
}


