
public class LaptopCharacteristics {
    String id;
    String model;
    String price;
    String color;
    String year;
    String screenSize;
    String hardDriveType;
    String hardDriveSize;
    String volumeOfOperationalMemory;
    String processorType;
    String videoCardType;
    String operatingTime;

    public LaptopCharacteristics(String id, String model, String price, String color, String year,
            String screenSize, String hardDriveType, String hardDriveSize,
            String volumeOfOperationalMemory, String processorType, String videoCardType, String operatingTime) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.color = color;
        this.year = year;
        this.screenSize = screenSize;
        this.hardDriveType = hardDriveType;
        this.hardDriveSize = hardDriveSize;
        this.volumeOfOperationalMemory = volumeOfOperationalMemory;
        this.processorType = processorType;
        this.videoCardType = videoCardType;
        this.operatingTime = operatingTime;
    }

    @Override
    public String toString() {
        return String.format(
                "\nid:%s\nmodel:%s\nprice:%s\ncolor:%s\nyear:%s\nscreenSize:%s\nhardDriveType:%s\nhardDriveSize:%s\nvolumeOfOperationalMemory:%s\nprocessorType:%s\nvideoCardType:%s\noperatingTime:%s",
                id, model, price, color, year, screenSize, hardDriveType, hardDriveSize, volumeOfOperationalMemory,
                processorType, videoCardType, operatingTime);
    }

    public String GetInfo(String filter) {

        if (filter == "model") {
            return model;
        }
        if (filter == "price") {
            return price;
        }
        if (filter == "color") {
            return color;
        }
        if (filter == "year") {
            return year;
        }
        if (filter == "screenSize") {
            return screenSize;
        }
        if (filter == "hardDriveType") {
            return hardDriveType;
        }
        if (filter == "hardDriveSize") {
            return hardDriveSize;
        }
        if (filter == "volumeOfOperationalMemory") {
            return volumeOfOperationalMemory;
        }
        if (filter == "processorType") {
            return processorType;
        }
        if (filter == "videoCardType") {
            return videoCardType;
        }
        if (filter == "operatingTime") {
            return operatingTime;
        }
        return "id продукта - " + id;
    }
}
