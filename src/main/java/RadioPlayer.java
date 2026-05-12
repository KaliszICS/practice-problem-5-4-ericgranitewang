class RadioPlayer implements Player {
    private boolean onOff;
    private double[] stationList;
    private double station;
    private int volume;
    private int index;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.station = 0;
        this.volume = 0;
        this.index = 0;
    }

    @Override
    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.station = this.stationList[0];
            this.index = 0;
        }
    }

    @Override
    public void stop () {
        if (this.onOff) {
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    @Override
    public void volumeUp() {
        this.volume += 2;
    }

    @Override
    public void volumeDown() {
        this.volume -= 2;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public void next() {
        this.index++;
        this.station = this.stationList[this.index];
    }

    public void previous() {
        this.index--;
        this.station = this.stationList[this.index];
    }

    public double getStation() {
        return this.station;
    }
}