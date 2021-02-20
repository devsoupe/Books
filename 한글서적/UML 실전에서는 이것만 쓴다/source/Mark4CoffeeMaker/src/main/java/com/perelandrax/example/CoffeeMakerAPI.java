package com.perelandrax.example;

/**
 * 마크 IV 특수 커피메이커 [명세]
 *
 * 1.
 * 끓이는 장치를 위한 가열기. 켜거나 끌 수 있다.
 *
 * 2.
 * 온열판을 위한 가열기. 켜거나 끌 수 있다.
 *
 * 3.
 * 온열판을 위한 감지기.
 * - wramerEmpty(온열판이 비어 있음)
 * - potEmpty(주전자가 비어 있음)
 * - potNotEmpty(주전자가 차 있음)
 * 등 세가지 상태가 있다.
 *
 * 4.
 * 끓이는 장치를 위한 감지기. 물이 있는지 없는지 측정한다.
 * - boilerEmpty(장치가 비어 있음)
 * - boilerNotEmpty(장치가 비어 있지 않음)
 * 두가지 상태가 있다.
 *
 * 5.
 * '끓임'버튼. 순간 방식 버튼이며 커피를 만드는 전체 주기를 시작한다.
 * 커피를 만드는 주기가 끝나고 커피가 준비될 때 불이 켜지는 작은 알림 장치가 들어 있다.
 *
 * 6.
 * 끓이는 장치의 압력을 줄이려고 열리는 압력 완화 벨브.
 * 압력이 약해지면 필터에 뿌려지는 물 흐름이 멈춘다.
 * 이 밸브는 열리거나 닫힐 수 있다.
 *
 */
public interface CoffeeMakerAPI {

  /**
   * 이 함수는 온열판 감지기의 상태를 반환한다. 이 감지기는
   * 주전자가 온열판 위에 있는지, 만약 있다면 커피가 주전자 안에
   * 들어 있는지 감지한다.
   */
  int getWarmerPlateStatus();

  int WRAMER_EMPTY = 0;
  int POT_EMPTY = 1;
  int POT_NOT_EMPTY = 2;

  /**
   * 이 함수는 끓이는 장치의 스위치 상태를 반환한다.
   * 이 스위치는 물 위에 뜬 형태로,
   * 끓이는 장치 안에 물이 반 잔 이상 있으면
   * 끓이는 장치가 비어 있지 않음을 감지한다.
   */
  int getBoilerStatus();

  int BOILER_EMPTY = 0;
  int BOILER_NOT_EMPTY = 1;

  /**
   * 이 함수는 '끓임(Brew)' 버튼의 상태를 반환한다.
   * 끓임 버튼은 순간 방식의 스위치이며 자신의 상태를 기억하는 능력이 있다.
   * 이 함수를 누를 때마다 자신이 기억하는 상태를 반환하며 그와 동시에
   * 자신의 상태를 BREW_BUTTON_NOT_PAUSED 상태로 다시 초기화한다.
   *
   * 따라서 이 함수의 폴링(polling) 주기가 굉장히 길지라도,
   * 끓임 버튼이 눌렸다는 사실을 감지할 수 있다.
   */
  int getBrewButtonStatus();

  int BREW_BUTTON_PUSHED = 0;
  int BREW_BUTTON_NOT_PUSHED = 1;

  /**
   * 이 함수는 끓이는 장치의 가열기를 켜거나 끈다.
   */
  void setBoilerState(int boilerStatus);

  int BOILER_ON = 0;
  int BOILER_OFF = 1;

  /**
   * 이 함수는 온열판의 가열기를 켜거나 끈다.
   */
  void setWarmerState(int warmerState);

  int WARMER_ON = 0;
  int WARMER_OFF = 1;

  /**
   * 이 함수는 끓임 버튼의 알림 장치의 불을 켜거나 끈다.
   * 커피 만드는 주기가 끝나면 알림 장치의 불이 켜져야 한다.
   * 그리고 사용자가 끓임 버튼을 누르면 불이 꺼져야 한다.
   */
  int setIndicatorState(int indicatorState);

  int INDICATOR_ON = 0;
  int INDICATOR_OFF = 1;

  /**
   * 이 함수는 압력 완화 벨브를 열거나 닫는다. 이 벨브가 닫혔으면
   * 끓이는 장치의 증기 압력이 뜨거운 물을 커피 필터 위에 뿌린다.
   * 이 밸브가 열리면, 끓이는 장치의 증기는 바깥으로 빠져나가므로,
   * 끓이는 장치의 물이 필터에 뿌려지지 않는다.
   */
  int setReliefValveState(int reliefValveState);

  int VALVE_OPEN = 0;
  int VALVE_CLOSED = 1;
}
