class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int index;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.currentSong = "";
        this.volume = 0;
        this.index = 0;
    }

    @Override
    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.currentSong = this.musicList[0];
            this.index = 0;
        }
    }

    @Override
    public void stop () {
        if (this.onOff) {
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    @Override
    public void volumeUp() {
        this.volume++;
    }

    @Override
    public void volumeDown() {
        this.volume--;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public void next() {
        this.index++;
        this.currentSong = this.musicList[this.index];
    }

    public void previous() {
        this.index--;
        this.currentSong = this.musicList[this.index];
    }

    public String getCurrentSong() {
        return currentSong;
    }
}