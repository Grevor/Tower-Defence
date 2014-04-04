package model.collision;

public class CollisionTypes {
	public static final long	GROUND	= enumerationToFlag(Enumerations.GROUND),
										AIR = enumerationToFlag(Enumerations.AIR),
										GROUND_PROJECTILE = enumerationToFlag(Enumerations.GROUND_PROJECTILE),
										AIR_PROJECTILE = enumerationToFlag(Enumerations.AIR_PROJECTILE);

	private enum Enumerations {
		GROUND,
		AIR,
		GROUND_PROJECTILE,
		AIR_PROJECTILE;
	}

	private static long enumerationToFlag(Enumerations e) {
		return 1 << e.ordinal();
	}
}
