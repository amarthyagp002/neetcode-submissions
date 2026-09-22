class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            Set<Character> rowduplicate = new HashSet<>();
            Set<Character> colduplicate = new HashSet<>();
            for(int j=0;j<9;j++){
                
                if(!rowduplicate.add(board[i][j])&& board[i][j]!='.'){
                    return false;

                }
                if(!colduplicate.add(board[j][i]) && board[j][i]!='.'){
                    return false;

                }
                
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> duplicate = new HashSet<>();
                if(board[i][j]!='.'&& !duplicate.add(board[i][j])){
                    return false;
                }
                if(board[i][j+1]!='.'&& !duplicate.add(board[i][j+1])){
                    return false;
                }
                if(board[i][j+2]!='.'&& !duplicate.add(board[i][j+2])){
                    return false;
                }               
                if(board[i+1][j]!='.'&& !duplicate.add(board[i+1][j])){
                    return false;
                }
                if(board[i+1][j+1]!='.'&& !duplicate.add(board[i+1][j+1])){
                    return false;
                }
                if(board[i+1][j+2]!='.'&& !duplicate.add(board[i+1][j+2])){
                    return false;
                }
                if(board[i+2][j]!='.'&& !duplicate.add(board[i+2][j])){
                    return false;
                }
                if(board[i+2][j+1]!='.'&& !duplicate.add(board[i+2][j+1])){
                    return false;
                }
                if(board[i+2][j+2]!='.'&& !duplicate.add(board[i+2][j+2])){
                    return false;
                }
            }
        }
        

       return true; 
    }
}
