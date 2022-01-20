package se.sofia.lab.restapplicationperfectnumber.entity;

import java.util.Objects;

public class PerfectNumberRange {
    private int start;
    private int end;

    public PerfectNumberRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof PerfectNumberRange))
            return false;
        PerfectNumberRange perfectNumberRange = (PerfectNumberRange) o;
        return Objects.equals(this.start, perfectNumberRange.start) && Objects.equals(this.end, perfectNumberRange.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.start, this.end);
    }

    @Override
    public String toString() {
        return "Perfect Number Range{" + "start=" + this.start + ", end='" + this.end + '\'' + '}';
    }
}
