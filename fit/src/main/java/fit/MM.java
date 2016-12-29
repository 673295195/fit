package fit;

import android.content.Context;

/**
 * @auther Tu enum@foxmail.com
 * @date 16/8/27
 */
public interface MM<T> {
  void save(Context context, String name, T obj);

  void save(Context context, T obj);

  T get(Context context);

  T get(Context context, String name);

  void clear(Context context);

  void clear(Context context, String name);
}
