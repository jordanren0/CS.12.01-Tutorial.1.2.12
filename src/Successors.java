public class Successors {

    public static Position findPosition(int num, int[][] array2d) {
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d[i].length; j++){
                if(array2d[i][j] == num){
                    Position position = new Position(i, j);
                    return position;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] array2d) {
        Position[][] arr = new Position[array2d.length][array2d[0].length];
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d[i].length; j++){
                arr[i][j] = findPosition(array2d[i][j] + 1, array2d);
            }
        }
        return arr;
    }
}
