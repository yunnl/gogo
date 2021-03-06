package yz.gogo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Entry {
    private String name;
    private String url;
    private String desc;
}
