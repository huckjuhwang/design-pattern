package Chapter5.hj;

enum ChocolateBoiler {
        BOILER;

        private boolean empty;
        private boolean boiled;

        ChocolateBoiler() {
            empty = true;
            boiled = false;
        }

        public void fill() {
            if(isEmpty()) {
                empty = false;
                boiled = false;
            }
        }
        public void drain() {
            if(!isEmpty()&& isBoiled()) {
                empty = true;
            }
        }
        public void boil() {
            if(!isEmpty()&& !isBoiled()) {
                boiled = true;
            }
        }
        public boolean isEmpty() {
            return empty;
        }
        public boolean isBoiled() {
            return boiled;
        }

}