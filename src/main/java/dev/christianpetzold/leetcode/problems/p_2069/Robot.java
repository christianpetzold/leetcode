package dev.christianpetzold.leetcode.problems.p_2069;

/**
 * <a href="https://leetcode.com/problems/walking-robot-simulation-ii">LeetCode Link</a>
 */
public class Robot {
  int width;
  int height;
  long stepsTaken;
  boolean hasMoved;

  public Robot(int width, int height) {
    this.width = width;
    this.height = height;
    hasMoved = false;
    stepsTaken = 0;
  }

  public void step(int num) {
    if (num > 0) hasMoved = true;
    stepsTaken += num;
    }

  public int[] getPos() {
    int totalStepsPerLap = ((width - 1) * 2) + ((height - 1) * 2);
    int stepsMinusFullLaps = (int) stepsTaken % totalStepsPerLap;


    if (stepsMinusFullLaps <= width-1){
      // Robot is in bottom row
      return new int[]{stepsMinusFullLaps,0};
    }
    stepsMinusFullLaps -= width-1;


    if(stepsMinusFullLaps <= height-1){
      // Robot is in last column
      return new int[]{width-1,stepsMinusFullLaps};
    }
    stepsMinusFullLaps -= height-1;

    if (stepsMinusFullLaps <= width-1){
      // Robot is in top row
      return new int[]{width-1-stepsMinusFullLaps, height-1};
    }

    // Robot is in first column
    stepsMinusFullLaps -= width-1;
    return new int[]{0, height-1-stepsMinusFullLaps};

  }

  public String getDir() {
    int[]position = getPos();

    // Robot is in bottom row
    if (position[1] == 0){
      if (position[0] == 0) return hasMoved ? "South" : "East";
      return "East";
    }

    // Robot is in last column and not in bottom right corner
    if(position[0] == width-1){
      return "North";
    }

    // Robot is in top row and not in top right corner
    if (position[1] == height-1){
      return "West";
    }

    // Robot is in first column and in neither top left nor bottom left corner
    return "South";
    }
}