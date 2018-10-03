void setup() {
size(500, 500);
fill(#FFEDAD);
ellipse(250, 250, 475, 475);
fill(#FDFFE3);
ellipse(250, 250, 450, 450);
}
//lkjlkj
void draw() {

PImage Pizza = loadImage ("pizza.ppm.gif");
PImage Pepperoni = loadImage ("pepperoni.ppm.gif");   
Pepperoni.resize(60, 60);
Pizza.resize(60, 60);
if (mousePressed && (mouseButton == RIGHT)) {
 image (Pepperoni, mouseX, mouseY); 
}
if (mousePressed && (mouseButton == LEFT)) {
 image (Pizza, mouseY, mouseX);
}
}