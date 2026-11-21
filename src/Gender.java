public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        switch (this) {
            case MALE -> {
                return "Мужской";
            }
            case FEMALE -> {
                return "Женский";
            }
            default -> {
                return "Не определилось";
            }
        }
    }
}

