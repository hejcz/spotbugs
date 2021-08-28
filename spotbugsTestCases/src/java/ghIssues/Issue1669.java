package ghIssues;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.specific.SpecificData;

public class Issue1669 {

    private static SpecificData MODEL$ = new SpecificData();

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("");

    private static final BinaryMessageDecoder<Issue1669> DECODER =
            new BinaryMessageDecoder<Issue1669>(MODEL$, SCHEMA$);

    public static BinaryMessageDecoder<Issue1669> getDecoder() {
        return DECODER;
    }

}
