/**
 * Отношения с Малышом
 */
enum Relative {
    /**
     * Отец
     */
    father {
        public String toString() {
            return "папа";
        }
    },
    /**
     * Мама
     */
    mother {
        public String toString() {
            return "мама";
        }
    },
    /**
     * Дядя
     */
    uncle {
        public String toString() {
            return "дядя";
        }
    },
    /**
     * Сиблинги - дети одних родителей (братья и сёстры одним словом)
     */
    sibling {
        public String toString() {
            return "сиблинг";
        }
    },
    /**
     * Домработница
     */
    housewife {
        public String toString() {
            return "домработница";
        }
    },;

    public boolean equals(Relative relative) {
        return this.hashCode() == relative.hashCode() && this.toString().equals(relative.toString());
    }
}
