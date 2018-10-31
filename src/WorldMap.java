import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JPanel;  
import javax.swing.Timer;  
public class WorldMap extends JPanel {
	private static final long serialVersionUID = -336975817478756636L;  
	private final int width=20;
	private final int length=20;
	private final int WORLD_MAP_DEATH=0;
	private final int WORLD_MAP_LIVE=1;
	private final int world[][]={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	private int nextStatus[][]=new int [world.length][world[0].length];
	private int tempStatus[][]=new int [world.length][world[0].length];
    private Timer timer;
    private final int DELAY_TIME=1200;
    public int [][] getMap() {
    	return world;
    }
    public int [][] gettempMap(){
    	return tempStatus;
    }
    public int [][] getnextMap(){
    	return nextStatus;
    }
    WorldMap(){
    	this.start();
    }
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (int i = 0; i < nextStatus.length; i++) {  
            for (int j = 0; j < nextStatus[i].length; j++) {  
                if (nextStatus[i][j] == WORLD_MAP_LIVE) {  
                    g.fillRect( j * width, i * length, width, length);  
                   
                } else {  
                	 g.drawRect( j * width, i * length, width, length); 
                }  
            }  
        }  
    }  
  public void start(){
    	for (int row = 0; row < world.length; row++) {  
            for (int col = 0; col < world[0].length; col++) {  
                nextStatus[row][col] = world[row][col];  
                tempStatus[row][col] = world[row][col];  
            }  
        }  
        // 创建计时器  
        timer = new Timer(DELAY_TIME, new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                changeCellStatus();  
                repaint();  
            }  
        });  
        // 开启计时器  
        timer.start();  

    }
   public  int neiborCount(int row,int col){
    	int count = 0, r = 0, c = 0;  
        for (r = row - 1; r <= row + 1; r++) {  
            for (c = col - 1; c <= col + 1; c++) {  
                if (r < 0 || r >=tempStatus.length || c < 0  
                        || c >= tempStatus[0].length) {  
                	 continue; 
                }  
                if(tempStatus[r][c]==WORLD_MAP_LIVE) count++;
            }  
        }  
        if(tempStatus[row][col]==WORLD_MAP_LIVE) count--;
        return count;  

    }
    public void changeCellStatus(){
    	for(int cow=0;cow < world.length;cow++)
    		for(int col=0;col < world[cow].length;col++)
    			switch(neiborCount(cow,col)){
    			case 0:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 1:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 2:
    				nextStatus[cow][col]=tempStatus[cow][col];
    				break;
    			case 3:
    				nextStatus[cow][col]=WORLD_MAP_LIVE;
    				break;
    			case 4:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 5:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 6:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 7:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			case 8:
    				nextStatus[cow][col]=WORLD_MAP_DEATH;
    				break;
    			
    			}
    	updateStatus();
    }
    public void updateStatus(){
    	for(int row=0;row < world.length;row++)
    		for(int col=0;col < world[row].length;col++)
    			tempStatus[row][col]=nextStatus[row][col];
    }
}
