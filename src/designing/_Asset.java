package designing;

/**
 *
 * @author kinopp
 */
public class _Asset {

    /**
     *
     */
    public enum AssetType { 

        /**
         *
         */
        BOND, 

        /**
         *
         */
        STOCK }; 
    private final AssetType type;
    private final int value;
    
    /**
     *
     * @param assetType
     * @param assetValue
     */
    public _Asset(final AssetType assetType, final int assetValue) {
        type = assetType;
        value = assetValue;
    }

    /**
     *
     * @return
     */
    public AssetType getType() { return type; }

    /**
     *
     * @return
     */
    public int getValue() { return value; }
}
