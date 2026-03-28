public class mainLab {
    public static void main(String[] args) {
        String[][] labirinto = new String[10][12];

        System.out.println("");
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                if (j == 0 || j == 9) {
                    labirinto[i][j] = "|";
                }
            }
        }

        

        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }
}
