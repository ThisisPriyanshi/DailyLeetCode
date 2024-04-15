class Solution {
    public double angleClock(int hour, int minutes) {
        //we have derived a formula for calculating  angle between the hour hands and minute hands 
        // hour hand moves 30 degree per hour and 0.5 degree per minute
        //minute hand moves 0 degree per hour(because it circle backs) and 6 degree per minute

        double hourHandAngle = (30 * hour) + (0.5 * minutes);
        double minuteHandAngle = minutes * 6;

        double angle = Math.abs(hourHandAngle - minuteHandAngle);

        return angle > 180 ? 360 - angle : angle;
    }
}