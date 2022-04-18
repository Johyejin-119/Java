package ch16_practice2;
/*
고객 센터에 전화 상담을 하는 상담원들이 있습니다. 일단 고객에게서 전화가 오면 대기열에 저장되고 각 상담원에게 배분이 됩니다.
배분이 되는 정책은 크게 세 가지가 있습니다.

1. 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.
2. 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
3. 고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.

*/

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
