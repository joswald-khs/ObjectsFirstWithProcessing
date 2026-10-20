int data[];

void setup() {
  size(800,800);
  data = new int[]{120,95,140};
  ellipseMode(RADIUS);
}

void draw() {
  drawPieChart(width/2.0,height/2.0,0.9*(width/2),data);
}

void drawPieChart(float x, float y, float r, int[] data ) {
color[] colors = {
  color(230, 25, 75),
  color(60, 180, 75),
  color(255, 225, 25),
};
  float total = 0;
  for( int i = 0; i < data.length; i++ ) {
    total += data[i];
  }
  
  //float[] arcThetas = new float[data.length];
  float theta = 0;
  for( int i = 0; i < data.length; i++ ) {
    fill(colors[i]);
    float oldTheta = theta;
    theta += TWO_PI * data[i]/total;
    arc( x,y,r,r,oldTheta,theta );
  }
    
}
