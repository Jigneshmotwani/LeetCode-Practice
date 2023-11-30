
class Street {
    public Street(int[] doors){

    }
    public void openDoor(){

    }
    public void closeDoor(){

    }
    public boolean isDoorOpen(){
        return true;
    }
    public void moveRight(){

    }
    public void moveLeft(){
        
    }
}

class Solution {
    public int houseCount(Street street, int k) {
        for(int i = 0;i<k;i++){
            street.closeDoor();
            street.moveRight();
        }
        int count = 0;
        while(!street.isDoorOpen()){
            count+=1;
            street.openDoor();
            street.moveRight();

        }
        return count;
    }
}