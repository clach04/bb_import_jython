package org.python.antlr;

import java.io.InputStream;
import java.io.IOException;

public class LeadingSpaceSkippingStream extends InputStream {

    private InputStream inputStream;
    private boolean maybeLeadingSpaces = true;

    public LeadingSpaceSkippingStream(InputStream is) {
        inputStream = is;
    }

    public int read() throws IOException {
        int i = inputStream.read();
        while (maybeLeadingSpaces) {
            if (i != ' ') {
                maybeLeadingSpaces = false;
            } else {
                i = inputStream.read();
            }
        }
        return i;
    }

    public boolean markSupported() {
        return inputStream.markSupported();
    }

    public void mark(int readAheadLimit) {
        inputStream.mark(readAheadLimit);
    }

    public void reset() throws IOException {
        maybeLeadingSpaces = true;
        inputStream.reset();
    }
}