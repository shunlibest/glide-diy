package com.example.glidemini.load.resource.file;

import com.example.glidemini.load.resource.SimpleResource;
import java.io.File;

/** A simple {@link com.bumptech.glide.load.engine.Resource} that wraps a {@link File}. */
// Public API.
@SuppressWarnings("WeakerAccess")
public class FileResource extends SimpleResource<File> {
  public FileResource(File file) {
    super(file);
  }
}
