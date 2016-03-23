package perturbation.perturbator;

import perturbation.PerturbatorInterface;

/**
 * Created by spirals on 21/03/16.
 */
public class InvPerturbatorImpl implements PerturbatorInterface {

    @Override
    public boolean pboolean(boolean value) {
        return !value;
    }

    @Override
    public byte pbyte(byte value) {
        return (byte)(-1 * value);
    }

    @Override
    public short pshort(short value) {
        return (short)(-1 * value);
    }

    @Override
    public int pint(int value) {
        return (-1 * value);
    }

    @Override
    public long plong(long value) {
        return (long)(-1 * value);
    }

    @Override
    public char pchar(char value) {
        return (char)(-1 * value);
    }

    @Override
    public float pfloat(float value) {
        return (-1 * value);
    }

    @Override
    public double pdouble(double value) {
        return (-1 * value);
    }

    @Override
    public String toString() {
        return "inv perturbator";
    }
}
