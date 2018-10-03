void setup(){
  size(500, 500);
  PImage face = loadImage("TestSubject.png");
  face.resize(500, 500);
  image(face, 0, 0);
  
}
void draw(){
 ellipse(193, 186, 50, 35);
 rotate(-0.25);
  ellipse(230, 240, 50, 35);
  
  
};