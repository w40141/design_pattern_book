public class MoonState implements State {
	private static MoonState singleton = new MoonState();

	private MoonState() {
	}

	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		} else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	};

	@Override
	public void doUse(Context context) {
		context.recordLog("非常: 昼食時の金庫使用!");
	};

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル(昼食時)");
	};

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("昼食時の留守録");
	};

	@Override
	public String toString() {
		return "[昼食時]";
	}
}
