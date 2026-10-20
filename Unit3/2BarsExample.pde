int[][] dataSet = new int[10][2];
color[] colors = {
  color(230, 25, 75),
  color(60, 180, 75),
  color(255, 225, 25), 
  color(0, 130, 200), 
  color(245, 130, 48),
  color(145, 30, 180),
  color(70, 240, 240), 
  color(240, 50, 230), 
  color(210, 245, 60), 
  color(250, 190, 212)
};

void setup() {
  size(800,800);
  for( int i = 0; i < dataSet.length; i++ ) {
    dataSet[i][0] = int(random(0,100));
    dataSet[i][1] = int(random(0,100));
  }
}

void draw() {
  // drawing axes
  // drawing labels
  for( int i = 0; i < dataSet.length; i++ ) {
    drawScoringBars( i * width/10 + width/20, height - (height - 100), (width/10) * 0.5, height - 200, dataSet[i], colors[i]); 
  }
}

void drawScoringBars(float x, float y, float w, float maxHeight, int[] data, color fillColor) {
  float h1 = 50; // calculate based off data[0]
  float h2 = 60; // calculate based off data[1]
  rect( x, y, w/2, h1 );
  rect( x + w/2, y, w/2, h2 );
}
