package com.fakeflix.system.domain.user;

public interface ViewService {
    void addViewer(Viewer newViewer);
    long getTotalViews();
}
