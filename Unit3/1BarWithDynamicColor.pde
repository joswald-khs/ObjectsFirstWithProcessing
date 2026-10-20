// six rectangles
//   - height determined by values
//   - one of six colors
//     - modified brightness by other values
float[][] dataSet = new float[6][2];
color[] colors = {
  color(230, 25, 75),
  color(60, 180, 75),
  color(255, 225, 25), 
  color(0, 130, 200), 
  color(245, 130, 48),
  color(145, 30, 180)
};

void setup() {
  size(800,800);
  for( int i = 0; i < dataSet.length; i++ ) {
    dataSet[i][0] = random(70,100);
    dataSet[i][1] = random(70,100);
  }
}

void draw() {
  // drawing axes
  // drawing labels
  for( int i = 0; i < 6; i++ ) {
    drawDataRectangle( i * width/7 + width/14, height - (height - 100), (width/6) * 0.5, height - 200, dataSet[i], colors[i]); 
  }
}

void drawDataRectangle( float x, float y, float w, float maxHeight, float[] data, color fillColor ) {
  color modifiedColor = fillColor;
  colorMode(HSB);
  modifiedColor = color(hue(modifiedColor), map( data[1], 70, 100, 80, 100 ), map( data[1], 70, 100, 80, 100 ) );
  float h = 100; // based on the data[0]
  fill( modifiedColor ); // modified by the data[1]
  rect( x, y, w, h );
  colorMode(RGB);
}
