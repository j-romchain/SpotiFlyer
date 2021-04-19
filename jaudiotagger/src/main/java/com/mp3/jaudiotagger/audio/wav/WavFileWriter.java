/*
 * Entagged Audio Tag library
 * Copyright (c) 2003-2005 Rapha�l Slinckx <raphael@slinckx.net>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *  
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.mp3.jaudiotagger.audio.wav;

import com.mp3.jaudiotagger.audio.exceptions.CannotWriteException;
import com.mp3.jaudiotagger.audio.generic.AudioFileWriter2;
import com.mp3.jaudiotagger.tag.Tag;

import java.io.File;

public class WavFileWriter extends AudioFileWriter2
{
   @Override
    protected void writeTag(Tag tag, File file) throws CannotWriteException
    {
        new WavTagWriter(file.getPath()).write(tag, file);
    }

    @Override
    protected void deleteTag(Tag tag, File file) throws CannotWriteException
    {
        new WavTagWriter(file.getPath()).delete(tag, file);
    }
}