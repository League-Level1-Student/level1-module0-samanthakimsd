int y = 30;
int randomNumber = (int) random(width);
void setup(){
size(600, 600);

}

void draw(){
background(0, 100, 150);

fill(0, 75, 175);
stroke(0, 50, 250);
  ellipse(300, y, 30, 30);
ellipse(300, y+200, 30, 30);
ellipse(300, y+400,30,30);
ellipse(300, y+600,30,30);
}