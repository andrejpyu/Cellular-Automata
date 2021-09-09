public class CellularAutomata {

    public int strength;
    public int x;
    public int y;
    public int id;


    public void setStrength(int strength){
        if(strength >0){
            this.strength= strength;
        }else{
            this.strength=1;
        }
    }
    public void setx(int x){
        if(x >=0){
            this.x= x;
        }else{
            this.x=1;
        }
    }
    public void sety(int y){
        if(y >=0){
            this.y= y;
        }else{
            this.y=1;
        }
    }

    public void setid(int id){
        if(id >=0){
            this.id= id;
        }else{
            this.id=1;
        }
    }
    public CellularAutomata(){
        this.strength = 0;
        this.id=0;
        this.x =0;
        this.y=0;
    }
    public CellularAutomata(int strength, int x, int y, int id){
        this.strength = strength;
        this.id=x;
        this.x =x;
        this.y=y;
    }

    public void interactNeighbors(ArrayList<CellularAutomata> Neighbors){

    }



}
