public class Player {

    private int hp;
    private int atk;
    private int spd;
    private int score;
    private double[] pos = new double[2];
    private Rectangle[] playerRec = new Rectangle[4];


    //getter and setters / accessors and mutators functions

    public double[] getPos()
    {
        return this.pos;
    }

    public int getScore()
    {
        return this.score;
    }

    public int getSpd()
    {
        return spd;
    }

    public int getAtk()
    {
        return atk;
    }

    public int getHp()
    {
        return hp;
    }

    public void setPos(double[] pos)
    {
        this.pos = pos;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void setSpd(int spd)
    {
        this.spd = spd;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public Player(GameArena arena)


    {
        // initiate position and rectangles representing the player
        this.pos[0] = 250;
        this.pos[1] = 275;
        this.playerRec[0] = new Rectangle(this.pos[0],this.pos[1],10,10,"#41F6FC");             //top  - left
        this.playerRec[1] = new Rectangle(this.pos[0],this.pos[1]+10,10,10,"#F32B00");          // down - left
        this.playerRec[2] = new Rectangle(this.pos[0]+10,this.pos[1]+10,10,10,"#00F338");       // down - right
        this.playerRec[3] = new Rectangle(this.pos[0]+10,this.pos[1],10,10,"#0908F7");          // top - right


        // add player rectangles to the arena 
        for (int i = 0; i < this.playerRec.length; i++) {
            arena.addRectangle(this.playerRec[i]);
          }
        


    }
    public static void main(String[] args)
    {   

    }      
}
