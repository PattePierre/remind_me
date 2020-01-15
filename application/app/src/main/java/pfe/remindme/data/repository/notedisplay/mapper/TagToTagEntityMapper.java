package pfe.remindme.data.repository.notedisplay.mapper;

import java.util.ArrayList;
import java.util.List;

import pfe.remindme.data.Note;
import pfe.remindme.data.Tag;
import pfe.remindme.data.entity.TagEntity;

public class TagToTagEntityMapper {
    public TagEntity map(Tag tag) {
        TagEntity tagEntity = new TagEntity();
        tagEntity.setTagName(tag.getTagName());

        tagEntity.setLinkedNotesIdList(tag.getLinkedNotes());

        return tagEntity;
    }
}
