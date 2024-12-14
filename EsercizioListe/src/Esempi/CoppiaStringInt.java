package Esempi;

public class CoppiaStringInt {

    private Integer z;
    private String stringZ;

    public CoppiaStringInt(Integer z, String stringZ) {
        this.z = z;
        this.stringZ = stringZ;
    }

    public Integer getZ() {
        return z;
    }

    public String getStringZ() {
        return stringZ;
    }

    @Override
    public String toString() {
        return "CoppiaStringInt{" +
                "z=" + z +
                ", stringZ='" + stringZ + '\'' +
                '}';
    }
}
