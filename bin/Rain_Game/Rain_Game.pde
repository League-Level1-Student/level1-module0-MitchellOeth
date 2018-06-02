int ry = 30;
int score;
int randomNumber = (int) random(width);
void setup() {
size(500,500);  
}
void draw() {
background(150,130,60);
rect(mouseX, 470, 20, 20);
fill(0, 0, 175);
stroke(0, 0, 175);
ellipse(randomNumber, ry, 5, 10);

ry+=3;
if(ry>=480){
ry=30;
if (randomNumber > mouseX && randomNumber < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score);
randomNumber = (int) random(width);
}
  
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}