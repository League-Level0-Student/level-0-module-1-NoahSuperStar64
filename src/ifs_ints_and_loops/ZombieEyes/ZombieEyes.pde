void setup(){
  size(500, 500);
  PImage face = loadImage("TestSubject.png");
  face.resize(500, 500);
  image(face, 0, 0);
  
}
void draw(){
  fill(mouseX, mouseY); 
 ellipse(193, 186, 50, 35);
 rotate(-0.25);
 fill(mouseY, mouseX);
  ellipse(230, 240, 50, 35);
  fill(#030202);
  ellipse(150, 230, 20, 20);
  ellipse(225, 240, 20, 20);
};