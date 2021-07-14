package Task09;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if (second == 60) {
            this.minute = minute + 1;
            this.second = 0;
            if (this.minute == 60) {
                this.hour = hour + 1;
                this.minute = 0;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        } else if (minute == 60) {
            this.hour = hour + 1;
            this.minute = 0;
            if (this.hour == 24) {
                this.hour = 0;
            }
        } else if (hour == 24) {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        if (hour > 9 && minute > 9 && second > 9) {
            return hour + ":" + minute + ":" + second;
        } else if (hour > 9 && minute > 9) {
            return hour + ":" + minute + ":" + "0" + second;
        } else if (hour > 9 && second > 9) {
            return hour + ":" + "0" + minute + ":" + second;
        } else if (minute > 9 && second > 9) {
            return "0" + hour + ":" + minute + ":" + second;
        } else if (hour > 9) {
            return hour + ":" + "0" + minute + ":" + "0" + second;
        } else if (minute > 9) {
            return "0" + hour + ":" + minute + ":" + "0" + second;
        } else if (second > 9) {
            return "0" + hour + ":" + "0" + minute + ":" + second;
        } else {
            return "0" + hour + ":" + "0" + minute + ":" + "0" + second;
        }
    }

    public Time nextSecond() {
        setTime(this.hour, this.minute, this.second + 1);
        if (this.second == 60) {
            this.minute = minute + 1;
            this.second = 0;
            if (this.minute == 60) {
                this.hour = hour + 1;
                this.minute = 0;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        } else if (this.minute == 60) {
            this.hour = hour + 1;
            this.minute = 0;
            if (this.hour == 24) {
                this.hour = 0;
            }
        } else if (this.hour == 24) {
            this.hour = 0;
        }
        return Time.this;
    }

    public Time previousSecond() {
        setTime(this.hour, this.minute, this.second - 1);
        if (this.second == -1) {
            this.second = 59;
            this.minute = this.minute - 1;
            if (this.minute ==-1) {
                this.minute = 59;
                this.hour = hour - 1;
                if (hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return Time.this;
    }
}
