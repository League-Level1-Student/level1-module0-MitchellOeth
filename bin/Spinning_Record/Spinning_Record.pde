import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;  //as member variable
void setup(){
minim = new Minim(this);  //in the setup method
song = minim.loadFile("awesomeTrack.wav", 16);//in the setup method

pictureOfRecord= loadImage("record.png");  //in setup method  
}
void draw() {
image(pictureOfRecord, 0, 0);//in draw method
size(100, 100);
if(mousePressed){
song.play();
rotateImage(pictureOfRecord,360);
}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}