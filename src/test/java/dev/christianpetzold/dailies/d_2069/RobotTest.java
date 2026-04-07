package dev.christianpetzold.dailies.d_2069;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {

  Robot robot;
  int lapSize;


  @BeforeEach
  void setup(){
    robot = new Robot(5,3);
    lapSize = 12;
  }
  @Test
  void shouldSucceedWhenPositionInBottomRow(){
    robot.step(2);
    assertArrayEquals(new int[]{2,0}, robot.getPos());
    assertEquals("East",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInBottomRowWithLaps(){
    robot.step(2 + lapSize);
    assertArrayEquals(new int[]{2,0}, robot.getPos());
    assertEquals("East",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInLastColumn(){
    robot.step(6);
    assertArrayEquals(new int[]{4,2}, robot.getPos());
    assertEquals("North",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInLastColumnWithLaps(){
    robot.step(6 + lapSize);
    assertArrayEquals(new int[]{4,2}, robot.getPos());
    assertEquals("North",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInTopRow(){
    robot.step(8);
    assertArrayEquals(new int[]{2,2}, robot.getPos());
    assertEquals("West",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInTopRowWithLaps(){
    robot.step(8 + lapSize);
    assertArrayEquals(new int[]{2,2}, robot.getPos());
    assertEquals("West",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInFirstColumn(){
    robot.step(11);
    assertArrayEquals(new int[]{0,1}, robot.getPos());
    assertEquals("South",robot.getDir());
  }

  @Test
  void shouldSucceedWhenPositionInFirstColumnWithLaps(){
    robot.step(11 + 12);
    assertArrayEquals(new int[]{0,1}, robot.getPos());
    assertEquals("South",robot.getDir());
  }


  @Test
  void leetcodeTestCase(){
    Robot r = new Robot(20, 14);

    r.step(244);
    assertArrayEquals(new int[]{0, 12}, r.getPos());
    assertEquals("South", r.getDir());

    r.step(3);
    r.step(39);
    r.step(7);
    r.step(31);
    r.step(42);

    // index 24: [5,13]
    assertArrayEquals(new int[]{5, 13}, r.getPos());

    // index 25: "West"
    assertEquals("West", r.getDir());

    // index 26
    r.step(35);

    // index 27
    r.step(11);

    // index 28
    r.step(36);

    // index 29
    r.step(29);

    // index 30
    r.step(10);

    // index 31: [12,13]
    assertArrayEquals(new int[]{12, 13}, r.getPos());

    // index 32: "West"
    assertEquals("West", r.getDir());

    // index 33
    r.step(49);

    // index 34
    r.step(31);

    // index 35: [0,9]
    assertArrayEquals(new int[]{0, 9}, r.getPos());

    // index 36: "South"
    assertEquals("South", r.getDir());

    // index 37
    r.step(31);

    // index 38
    r.step(47);

    // index 39: [5,0]
    assertArrayEquals(new int[]{5, 0}, r.getPos());

    // index 40: "East"
    assertEquals("East", r.getDir());

    // index 41
    r.step(29);

    // index 42
    r.step(1);

    // index 43: [16,13]
    assertArrayEquals(new int[]{16, 13}, r.getPos());

    // index 44: "West"
    assertEquals("West", r.getDir());

    // index 45
    r.step(5);

    // index 46
    r.step(44);
  }

}
