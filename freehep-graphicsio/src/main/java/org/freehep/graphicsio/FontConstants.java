// Copyright 2003, FreeHEP.
package org.freehep.graphicsio;

/**
 * 
 * @author Mark Donszelmann
 * @version $Id: freehep-graphicsio/src/main/java/org/freehep/graphicsio/FontConstants.java 5641ca92a537 2005/11/26 00:15:35 duns $
 */
public class FontConstants {

    private FontConstants() {
    }

    // Font Embedding
    public static final String EMBED_FONTS = "EmbedFonts";

    public static final String EMBED_FONTS_AS = "EmbedFontsAs";

    public static final String EMBED_FONTS_TYPE1 = "Type1";

    public static final String EMBED_FONTS_TYPE3 = "Type3";

    public static final String[] getEmbedFontsAsList() {
        return new String[] { EMBED_FONTS_TYPE1, EMBED_FONTS_TYPE3 };
    }
}