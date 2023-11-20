public class CharMatrix
{
    char[][] arr;
    
    public CharMatrix(int rows, int cols){
        arr = new char[rows][cols];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
            arr[i][j]=' ';
        } 
        }
    }
    
    public CharMatrix(int rows, int cols, char fill){
        arr = new char[rows][cols];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
            arr[i][j]=fill;
        } 
        }
    }
    
    public void display(){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public int numRows(){
        return arr.length;
    }
    
    public int numCols(){
        return arr[0].length;
    }
    
    public char charAt(int row, int col){
        return arr[row][col];
    }
    
    public void setCharAt(int row, int col, char ch){
        arr[row][col] = ch;
    }
    
    public boolean isEmpty(int row, int col){
        if (arr[row][col]==' ') return true;
        return false;
    }
    
    public void fillRect(int row0, int col0, int row1, int col1, char fill){
        for (int i = row1; i >= row0; i--){
            for (int j = col0; j <= col1; j++){
                arr[i][j] = fill;
            }
        }
    }
    
    public void clearRect(int row0, int col0, int row1, int col1){
        for (int i = row1; i >= row0; i--){
            for (int j = col0; j <= col1; j++){
                arr[i][j] = ' ';
            }
        }
    }
    
    public int countInRow(int row){
        int count = 0;
        for (int i = 0; i < arr[0].length; i++){
            if (arr[row][i] != ' ') count++;
        }
        return count;
    }
    
    public int countInCol(int col){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i][col] != ' ') count++;
        }
        return count;
    }

}
