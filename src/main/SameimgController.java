package main;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SameimgController {

	private List<Button> buttons = new ArrayList<Button>();
	private int clickedBtn = 0;
	private List<ImageView> images = new ArrayList<ImageView>(); 
	private List<File> Files = new ArrayList<File>(); 
	private List<Integer> imgnameList = new ArrayList<Integer>();
	private Button dBtn;
	private int cnt=0;
	
	   @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ImageView img0;

	    @FXML
	    private Button btn_0;

	    @FXML
	    private ImageView img1;

	    @FXML
	    private Button btn_1;

	    @FXML
	    private ImageView img2;

	    @FXML
	    private Button btn_2;

	    @FXML
	    private ImageView img3;

	    @FXML
	    private Button btn_3;

	    @FXML
	    private ImageView img4;

	    @FXML
	    private Button btn_4;

	    @FXML
	    private ImageView img5;

	    @FXML
	    private Button btn_5;

	    @FXML
	    private ImageView img6;

	    @FXML
	    private Button btn_6;

	    @FXML
	    private ImageView img7;

	    @FXML
	    private Button btn_7;

	    @FXML
	    private ImageView img9;

	    @FXML
	    private Button btn_9;

	    @FXML
	    private ImageView img10;

	    @FXML
	    private Button btn_10;

	    @FXML
	    private ImageView img11;

	    @FXML
	    private Button btn_11;

	    @FXML
	    private ImageView img12;

	    @FXML
	    private Button btn_12;

	    @FXML
	    private ImageView img13;

	    @FXML
	    private Button btn_13;

	    @FXML
	    private ImageView img14;

	    @FXML
	    private Button btn_14;

	    @FXML
	    private ImageView img15;

	    @FXML
	    private Button btn_15;

	    @FXML
	    private ImageView img8;

	    @FXML
	    private Button btn_08;
	    
	    @FXML
	    private Label count;

    @FXML
    void initialize() {
    	   assert img0 != null : "fx:id=\"img0\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_0 != null : "fx:id=\"btn_0\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img1 != null : "fx:id=\"img1\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_1 != null : "fx:id=\"btn_1\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img2 != null : "fx:id=\"img2\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_2 != null : "fx:id=\"btn_2\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img3 != null : "fx:id=\"img3\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_3 != null : "fx:id=\"btn_3\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img4 != null : "fx:id=\"img4\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_4 != null : "fx:id=\"btn_4\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img5 != null : "fx:id=\"img5\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_5 != null : "fx:id=\"btn_5\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img6 != null : "fx:id=\"img6\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_6 != null : "fx:id=\"btn_6\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img7 != null : "fx:id=\"img7\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_7 != null : "fx:id=\"btn_7\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img9 != null : "fx:id=\"img9\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_9 != null : "fx:id=\"btn_9\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img10 != null : "fx:id=\"img10\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_10 != null : "fx:id=\"btn_10\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img11 != null : "fx:id=\"img11\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_11 != null : "fx:id=\"btn_11\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img12 != null : "fx:id=\"img12\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_12 != null : "fx:id=\"btn_12\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img13 != null : "fx:id=\"img13\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_13 != null : "fx:id=\"btn_13\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img14 != null : "fx:id=\"img14\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_14 != null : "fx:id=\"btn_14\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img15 != null : "fx:id=\"img15\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_15 != null : "fx:id=\"btn_15\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert img8 != null : "fx:id=\"img8\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert btn_08 != null : "fx:id=\"btn_08\" was not injected: check your FXML file 'sameimg.fxml'.";
           assert count != null : "fx:id=\"count\" was not injected: check your FXML file 'sameimg.fxml'.";
           count.setText(cnt+"");
           
        //button들을 List에 담는다.
        buttons.add(btn_0);
        buttons.add(btn_1);
        buttons.add(btn_2);
        buttons.add(btn_3);
        buttons.add(btn_4);
        buttons.add(btn_5);
        buttons.add(btn_6);
        buttons.add(btn_7);
        buttons.add(btn_08);
        buttons.add(btn_9);
        buttons.add(btn_10);
        buttons.add(btn_11);
        buttons.add(btn_12);
        buttons.add(btn_13);
        buttons.add(btn_14);
        buttons.add(btn_15);
        
        for(int i=0;i<buttons.size();i++) {
			buttons.get(i).setVisible(false);//처음에 버튼을 사라지게 하여 그림을 보여준다.
		}
		

       	Timer timer1 = new Timer();
	    TimerTask t_task2 = new TimerTask() {

			@Override
			public void run() {
					for(int i=0;i<buttons.size();i++) {
						buttons.get(i).setVisible(true);
					}
				    
				
				}
			};timer1.schedule(t_task2, 3000);//3초 후 버튼을 보여주어 그림을 가린다.
	    

				//imageView를 List 에 담는다.
			 	images.add(img0);
		        images.add(img1);
		        images.add(img2);
		        images.add(img3);
		        images.add(img4);
		        images.add(img5);
		        images.add(img6);
		        images.add(img7);
		        images.add(img8);
		        images.add(img9);
		        images.add(img10);
		        images.add(img11);
		        images.add(img12);
		        images.add(img13);
		        images.add(img14);
		        images.add(img15);
		        

		        //중복되지않고 렌덤하게 그림을 setting 하는 부분
		        HashSet<Integer> number = new HashSet<Integer>();
		        
		        for(int i=0;number.size()<16;) {
		        	//그림이 총 16에 들어가므로 0~15중 랜덤수를 뽑는다.
		        		int numb = (int)(Math.random()*16);
		        		if(number.add(numb)){//set 에 추가가 되면 중복된 수가 아님..
		        			if(numb<8) {
		        				//그림 이름을 숫자로 해놓았으므로 랜덤수 에 해당하는 그림을 i 번째 imgView에 setting 해준다.
		        				File file = new File("img/"+numb+".jpg");
		        				Image image = new Image(file.toURI().toString());
		        				images.get(i).setImage(image);
		        				
		        				// seeting 된 그림을 저장할 list 를 만들고 그림 번호(랜덤수->numb)를 setting 한다.
		        				imgnameList.add(numb);
		          			  
		        			}else {
		        				//그림 갯수가 총 8가지 이므로 랜덤수가 8 이상 나오면 랜덤수에서 -8 한 번째의 그림을 i번째 imgView에 setting 해준다.
		        				  File file = new File("img/"+(numb-8)+".jpg");
		            			  Image image = new Image(file.toURI().toString());
		            			  images.get(i).setImage(image);
		            			  
		            			// seeting 된 그림을 저장할 list에 그림 번호(랜덤수->numb)를 seeting 한다.
		            			 //imgnameList 에는 같은 그림번호가 두개씩 있다. 
		            			  imgnameList.add(numb-8);
		          				
		        			}
		        			
		        			  
		        			i++;
		        			
		        			
		        		}
		        		
		        }

		        			
	    //버튼 클릭 이벤트 주는 부분
		        
        for(Button bbtn : buttons) {
     	   bbtn.setOnAction(e->{
     		   Button cBtn = (Button) e.getSource();
     		   if(clickedBtn==0) {//clickBtn은 flag 역할을 하며 이 변수값이 0 이면 첫번째 클릭 이다.
     			  cBtn.setVisible(false); //버튼을 사라지게하여 그림을 보이게 한다.
     			  if(dBtn==null) {
     				 dBtn=cBtn;//dBtn에 이 버튼을 저장해 놓는다.
        			  clickedBtn++;//flag 값을 1 증가 시켜 다음번 클릭시에 아래의 else 구문이 수행된다.
     			  }else {
     				  cBtn.setVisible(true);
     			  }
     			 
     		   }else {
     			   	
	     			 cBtn.setVisible(false);//클릭한 버튼을 사라지게 하여 그림을 보여준다.
	     			 int cgetName = buttons.indexOf(cBtn);//두번째 클릭한 버튼의 인덱스를 구해온다.
	     			 int clgetName=buttons.indexOf(dBtn);//첫번째 클릭한 버튼의 인덱스를 구해온다.
	     			 
	     			//위에서 구한 인덱스 값에 해당하는 imgnameList의   값(imgname)들이 서로 같다면 같은 이미지가 배치된것이다.
	     			 if(imgnameList.get(cgetName)==imgnameList.get(clgetName)) {
	     				 
	     				clickedBtn=0; //button이 사라진 상태(그림이 보이는 상태)로  flag를 0으로 바꾼다.
	     				dBtn=null;
//	     				 
	     			 }else {//만약 인덱스 값에 해당하는 imgnameList의 값이 서로 같지 않다면
	     				 
			       	    	Timer timer = new Timer();
			       	    	TimerTask t_task = new TimerTask() {
			       	    		
			       				@Override
			       				public void run() {
			       					
			       					cBtn.setVisible(true);
			       					dBtn.setVisible(true);
			       					dBtn=null;
			       				}
			       	    	};timer.schedule(t_task, 500);//0.5초 뒤에 다시 버튼을 보이게 하여 그림을 가린다.
		       			
			       	    	clickedBtn=0;//flag는 다시 0으로 만들어 준다.
	     			 }
	     			 
	     			 cnt++;
	     			 count.setText(cnt+"");
	     			 
     		  }
     	   });
        }
        
       
        
    }//initialize()
    

    
}
