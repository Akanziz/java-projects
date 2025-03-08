import java.util.ArrayList;
import java.util.List;

class BigNat implements Comparable<BigNat> {

    private List<Integer> l;

    BigNat(String number) {
        this.l = new ArrayList<>();

        for (int i = number.length() - 1; i >= 0; i--) {
            char n = number.charAt(i);
            int n1 = Character.getNumericValue(n);

            this.l.add(n1);
        }
    }

    @Override
    public String toString() {
        StringBuilder nsb = new StringBuilder();

        for (int i = this.l.size() - 1; i >= 0; i--) {
            nsb.append(this.l.get(i));
        }

        return nsb.toString();
    }

    @Override
    public BigNat clone() {
        BigNat newBigNat = new BigNat(this.toString());
        return newBigNat;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj instanceof BigNat) {
            BigNat newBigNat = (BigNat) obj;

            return this.l.equals(newBigNat.l);
        }

        return false;
    }

    @Override
    public int compareTo(BigNat b) {
        if (this.equals(b)) {
            return 0;
        }

        int sizeA = this.l.size();
        int sizeB = b.l.size();

        if (sizeA < sizeB) {
            return -1;
        } else if (sizeA > sizeB) {
            return 1;
        }

        for (int i = sizeA -1; i >= 0; i--) {
            int digitA = this.l.get(i);
            int digitB = b.l.get(i);

            if (digitA < digitB) {
                return -1;
            } else if (digitA > digitB) {
                return 1;
            }
        }

        return 0;
    }

    void add(BigNat bn) {
        int max = Math.max(this.l.size(), bn.l.size());
        int carry = 0;

        for (int i = 0; i < max || carry != 0; i++) {
            int sum = 0;

            if (bn.l.size() > i) {
                if (i == this.l.size()) {
                    this.l.add(0);
                }

                sum = this.l.get(i) + bn.l.get(i) + carry;
            } else {
                if (i == this.l.size()) {
                    this.l.add(0);
                }
                sum = this.l.get(i) + carry;
            }
            carry = sum / 10;

            l.set(i, sum % 10);
        }
    }

    /**
     * TODO.
     *
     * @param bn
     */
    void sub(BigNat bn) {
        int max = Math.max(this.l.size(), bn.l.size());
        int carry = 0;
        int sum;

        if(this.compareTo(bn) == -1){
            BigNat temp = new BigNat("0");
            this.l = temp.l;
            return;
        }

        for (int i = 0; i < max; i++) {

            int subtrahend;
            if (i < bn.l.size()) {
                subtrahend = bn.l.get(i);
            } else {
                subtrahend = 0;
            }

            int minuend;
            if (i < this.l.size()) {
                minuend = this.l.get(i);
            } else {
                minuend = 0;
            }



            sum = minuend - subtrahend - carry;

            if (sum < 0) {
                sum += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            if (i < this.l.size()) {
                this.l.set(i, sum);
            } else {
                this.l.add(sum);
            }

        }
        while (this.l.size() > 1 && this.l.get(this.l.size() - 1) == 0) {
            this.l.remove(this.l.size() - 1);
        }
    }

    void mul(BigNat bn) {
        int max = (this.l.size() + bn.l.size());
        ArrayList<Integer> mult = new ArrayList<>(max);
        for(int p = 0; p < max ;p++){
            mult.add(0);
        }
        int n = 0;

        for (int i = 0; i < this.l.size(); i++) {
            int carry = 0;

            for (int j = 0; j < bn.l.size() || carry > 0; j++) {
                int prod = mult.get(i + j) + this.l.get(i) * (j < bn.l.size() ? bn.l.get(j) : 0) + carry;
                mult.set(i + j, prod % 10);
                carry = (prod) / 10;

            }
        }
        this.l = mult;
        while (this.l.size() > 1 && this.l.get(this.l.size() - 1) == 0) {
            this.l.remove(this.l.size() - 1);
        }
    }

    void div(BigNat bn) {
        if (bn.l.size() == 1 && bn.l.get(0) == 0) {
            return;
        }

        if (this.compareTo(bn) < 0) {
            this.l.clear();
            this.l.add(0);
            return;
        }

        BigNat quote = new BigNat("0");
        BigNat quote2 = new BigNat("1");

        while (this.compareTo(bn) >= 0) {
            this.sub(bn);
            quote.add(quote2);
        }

        this.l = new ArrayList<>(quote.l);
    }
}

