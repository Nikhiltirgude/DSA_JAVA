class Solution {

public double angleClock(int hour, int minutes) {

double minhand=6.0*minutes;
double hourhand=30.0*(hour%12)+0.5*minutes;

double diff=Math.abs(minhand-hourhand);

return Math.min(diff, 360.0-diff);
}
}