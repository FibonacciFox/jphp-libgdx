<?php

namespace gdx;


abstract class ApplicationAdapter
{
    /** Called when the {@link Application} is first created. */
    public abstract function create();

    /** Called when the {@link Application} is resized.
     * This can happen at any point during a non-paused state but will never happen before a call to {@link #create()}.
     *
     * @param int $width the new width in pixels
     * @param int $height the new height in pixels
     */
    public abstract function resize(int $width, int $height);

    /** Called when the {@link Application} should render itself. */
    public abstract function render();

    /** Called when the {@link Application} is paused, usually when it's not active or visible on-screen.
     * An Application is also paused before it is destroyed.
     */
    public abstract function pause();

    /** Called when the {@link Application} is resumed from a paused state, usually when it regains focus. */
    public abstract function resume();

    /** Called when the {@link Application} is destroyed. Preceded by a call to {@link #pause()}. */
    public abstract function dispose();
}
